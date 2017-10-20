var express = require( "express" );

// PageRouter definitions
var pageRouter = express.Router();

pageRouter.get( "/login.html", function( req, res ) {
    res.sendFile( __dirname + "/www/login.html" );
} );

pageRouter.get( "/register.html", function( req, res ) {
    res.sendFile( __dirname + "/www/register.html" );
} );

module.exports.pageRouter = pageRouter;

// APIRouter definitions
var apiRouter = express.Router();

apiRouter.post( "/login", function( req, res ) {
    console.log( req.body.emailId );
    console.log( req.body.password );
    res.redirect( "/www/register.html" );
} );

module.exports.apiRouter = apiRouter;