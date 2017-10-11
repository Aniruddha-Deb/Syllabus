var express = require( "express" );
var app = express();

app.get( "/", ( req, res ) => {
    res.sendFile( __dirname + "/client/homePage.html" );
} );

app.listen( 8080 );
console.log( "Server started" );