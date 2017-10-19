var PageRouter = function() {
}

PageRouter.prototype.route = function( app ) {

    app.get( "/login.html", function( req, res ) {
        res.sendFile( "/www/login.html", {root: "app/"} );
    } );

    app.get( "/register.html", function( req, res ) {
        res.sendFile( "/www/register.html", {root: "app/"} );
    } );
}

module.exports = new PageRouter();