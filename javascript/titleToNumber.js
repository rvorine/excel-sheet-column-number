function titleToNumber(columnTitle) {
  let result = 0;

  for (const ch of columnTitle) {
    // shift previous letters one place left (base 26), add this letter's value A=1..Z=26
    result = result * 26 + (ch.charCodeAt(0) - 64);
  }
  return result;
}

console.log(titleToNumber("A"));   // 1
console.log(titleToNumber("AB"));  // 28
console.log(titleToNumber("ZY"));  // 701

module.exports = { titleToNumber };
