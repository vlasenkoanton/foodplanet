$(document).ready(function() {
    alert(x.sort(DescComparator));
});

var x = ["zero", "one", "two", "zorro", "zion", "abc"];

/**
 * @return {number}
 */
var DescComparator = function(a, b) {
     if (a.charAt(0) === 'z' && b.charAt(0) === 'z') {
         return 0;
     } else if (a.charAt(0) === 'z') {
         return -1;
     } else if (b.charAt(0) === 'z') {
         return 1;
     } else {
         if (a === b) {
             return 0;
         } else if (a < b) {
             return -1;
         } else {
             return 1;
         }
     }
};