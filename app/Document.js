var Item = function( name ) {
    this.name = name;
    this.subItems = [];
}

Item.prototype.addSubItem = function( item ) {
    this.subItems.add( item );
}

var mongoose = require( "mongoose" );

var docSchema = mongoose.Schema( {
    title : {type : String, required : true },
    items: Array
} );

docSchema.methods.addItem = function( item ) {
    this.items.push( item );
}

docSchema.methods.removeItem = function( item ) {
    this.items.remove( item );
}

var Document = mongoose.model( "Documents", docSchema );

module.exports = Document;
module.exports.Item = Item;