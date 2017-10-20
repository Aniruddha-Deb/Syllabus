var express = require( "express" );
var app = express();
var router = require( "./router.js" );

app.use( express.urlencoded() );

app.use( "/www", router.pageRouter );
app.use( "/api", router.apiRouter );

app.listen( 8080 );
console.log( "Started server" );