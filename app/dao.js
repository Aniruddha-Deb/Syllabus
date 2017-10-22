var MongoClient = require( "mongodb" ).MongoClient;

// User object
function User( emailId, password ) {
    this.emailId = emailId;
    this.password = password;
}
module.exports.User = User;