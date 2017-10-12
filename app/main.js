var express = require( "express" );
var mongoose = require( "mongoose" );
var app = express();

mongoose.connect( "mongodb://localhost/Syllabus" );
var db = mongoose.connection;

var Document = require( "./Document" );

var doc = new Document();
var item1 = new Document.Item( "Apple" );
var item2 = new Document.Item( "Banana" );
doc.addItem( item1 );
doc.addItem( item2 );

doc.removeItem( item1 );
doc.save();

app.get( "/", ( req, res ) => {
    res.send( "<html><body>" + Document.find( {name: } ) + "</body></html>" );
} );

app.listen( 8080 );
console.log( "Server started" );