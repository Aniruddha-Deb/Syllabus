var express = require( "express" );
var app = express();

var Item = require( "./item" );

var root = new Item( "CEO" );
var CTO = new Item( "CTO" );
root.addItem( root, CTO );
root.addItem( root, new Item( "CFO" ) );
root.addItem( root, new Item( "COO" ) );
root.removeItem( root, CTO );

app.get( "/", ( req, res ) => {
    res.send( "<html><body>" + JSON.stringify( root ) + "</body></html>" );
} );

app.listen( 8080 );
console.log( "Server started" );