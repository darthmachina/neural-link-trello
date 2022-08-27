fun main() {
    js("""var nl = require('neural-link-trello');
        console.log("nl created, calling initialize()", nl);
        TrelloPowerUp.initialize({
            'card-buttons': function(t, options) {
                console.log("card-buttons capability")
                return [{
                    icon: '/static/icon-dark.png',
                    text: 'Neural Link Test',
                    callback: function(t) {
                        console.log("callback nl", nl);
                        nl.cardButtons(t); 
                    }
                }];
            },
        });""")
}
