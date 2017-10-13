var express = require( "express" );
var app = express();
var MongoClient = require( "mongodb" ).MongoClient;
var Item = require( "./item" );

var root = new Item( "CEO" );
var CTO = new Item( "CTO" );
root.addItem( root, CTO );
root.addItem( root, new Item( "CFO" ) );
root.addItem( root, new Item( "COO" ) );

MongoClient.connect( "mongodb://localhost/Syllabus", (err, db) => {
    if( err ) {
        throw err;
    }
    console.log( "Connected to DB" );
    
    var collection = db.collection( "Documents" );
    collection.insertOne( root, (err, result) => {
        if( err ) throw err;
        else console.log( result.result );
    } );
} );


app.get( "/", ( req, res ) => {
    res.send( "<html><body>" + JSON.stringify( root ) + "</body></html>" );
} );

app.listen( 8080 );
console.log( "Server started" );