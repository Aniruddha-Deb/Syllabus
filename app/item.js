var Item = function( name ) {
    this.name = name;
    this.subItems = [];
}

Item.prototype.addItem = function( parent, item ) {
    this.preOrder( parent, () => parent.subItems.push( item ) );
}

Item.prototype.removeItem = function( parent, item ) {
    this.preOrder( parent, () => {
        parent.subItems.splice( 
            parent.subItems.indexOf( item ), 1 
        ) 
    } );
}

Item.prototype.preOrder = function( item, fn ) {
    if( item ) {
        if( fn ) {
            fn( item );            
        }
        else {
            for( i=0; i<item.subItems.length; i++ ) {
                this.preOrder( item.subItems[i], fn );
            }
        }
    }
}

module.exports = Item;