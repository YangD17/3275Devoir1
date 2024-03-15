Main: Takes the initial binary string,splits it and does a xor operation on first half and second half : FirstHalf xor SecondHalf

CribDrag:Takes input of user(text) and does xor of result of Main with text in binary form which is concatenated to test the whole binary string, outputs the xor with different offsets, it offsets for the length of the crib word

example in text form:

thisisanexampleofthecodeintextform 

thethethethethethethethethethethet

and then

thisisanexampleofthecodeintextform 
 
_thethethethethethethethethethethe (offset by 1)

in this example the offset would be of length 3 as "the" is 3 letters and so the concatenations of 'the' would move 3 times and there will be a xor operation between the binary string and the word(or text) entered for each offset testing every letter.

Note: 1.'thisisanexampleofthecodeintextform' would be entered as input in binary form by user and 'the' in text form
      2. First n letters will not be tested by every letters of the word as the concatenations do not loop back to the start where n is length of word or text entered.


Usage:
1. Enter binary string which you want to split and xor first half with second half
2. Enter asdf to signify end of input for binary string
3. Enter text you want to test -> example: 'the'
4. enter asdf to signify end of string input
5. Output will be n paragraphs of text separated by multiple newlines where n is the length of the string(number of times the text is offset by one)
