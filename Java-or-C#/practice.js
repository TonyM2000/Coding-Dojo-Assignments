/* 
  Given a string,
  return a new string with the duplicates excluded
  Bonus: Keep only the last instance of each character.
*/

const str1 = "abcABC";
const expected1 = "abcABC";

const str2 = "helloo";
const expected2 = "helo";

const str3 = "";
const expected3 = "";

const str4 = "aa";
const expected4 = "a";

const str5 = "yeeeeees";
const expected5 = "yes";

const str_bonus = "SuperTxT";
const expected_bonus = "SuperxT";

/**
 * De-dupes the given string.
 * - Time: O(?).
 * - Space: O(?).
 * @param {string} str A string that may contain duplicates.
 * @returns {string} The given string with any duplicate characters removed.
 */
function stringDedupe(str) {
    var newstring = "";
    var newtable = {};
    for (i in str){
        if (!(str[i] in newtable)){
            newtable[str[i]] = 1;
            newstring += str[i];
        }
        else{
            newtable[str[i]] = newtable[str[i]]+1;
        }
    }
    return newstring;
}
console.log(stringDedupe(str3));

// const str1 = "hello";
// const expected1 = "olleh";

// const str2 = "hello world";
// const expected2 = "olleh dlrow";

// const str3 = "abc def ghi";
// const expected3 = "cba fed ihg";

// /**
//  * Reverses the letters in each words in the given space separated
//  * string of words. Does NOT reverse the order of the words themselves.
//  * - Time: O(?).
//  * - Space: O(?).
//  * @param {string} str Contains space separated words.
//  * @returns {string} The given string with each word's letters reversed.
//  */
// function reverseWords(str) {
//     var mystring = "";
//     for (var i = str.length-1; i >= 0; i--){
//         mystring += str[i];
//     }
//     return mystring
// }
// console.log(reverseWords(str2))