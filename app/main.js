var express = require( "express" );
var app = express();

var PageRouter = require( "./server/router/page_router.js" );
PageRouter.route( app );

app.use( express.urlencoded() );
app.post( "/api/login", function( req, res ) {
    console.log( req.body.emailId );
    console.log( req.body.password );
    res.redirect( "/register.html" );
} );

app.listen( 8080 );
console.log( "Started server" );