fun main() {
    js("""var nl = require('neural-link-trello');
        TrelloPowerUp.initialize({
            'card-buttons': function(t, options) {
                console.log("card-buttons capability")
                return [{
                    icon: '/static/icon-dark.png',
                    text: 'Estimate Size',
                    callback: function(t) { nl.cardButtons(t); }
                }];
            },
        });""")
}
