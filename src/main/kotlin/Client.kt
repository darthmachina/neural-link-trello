import trello.CardButton

fun main() {
    js("""TrelloPowerUp.initialize({
        'card-buttons': function(t, options){
            return [{
                icon: '/static/icon-dark.png',
                text: 'Estimate Size',
            }];
        },
    })""")
}
