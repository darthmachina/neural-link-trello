!function(t,e){"object"==typeof exports&&"object"==typeof module?module.exports=e():"function"==typeof define&&define.amd?define([],e):"object"==typeof exports?exports["neural-link-trello"]=e():t["neural-link-trello"]=e()}(this,(function(){return t={32:function(t,e,o){var n,r;void 0===(r="function"==typeof(n=function(t){"use strict";return e=o(32),console.log("nl created, calling initialize()",e),TrelloPowerUp.initialize({"card-buttons":function(t,o){return console.log("card-buttons capability"),[{icon:"/static/icon-dark.png",text:"Estimate Size",callback:function(t){console.log("callback nl",e),e.neurallink.cardButtons(t)}}]}}),t;var e})?n.apply(e,[e]):n)||(t.exports=r)}},e={},function o(n){var r=e[n];if(void 0!==r)return r.exports;var i=e[n]={exports:{}};return t[n].call(i.exports,i,i.exports,o),i.exports}(32);var t,e}));
//# sourceMappingURL=neural-link-trello.js.map