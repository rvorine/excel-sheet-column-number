[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

# Excel Sheet Column Number (LeetCode 171)

## Problem

Given a column title as it appears in an Excel sheet (`A`, `B`, ..., `Z`, `AA`, `AB`, ...), return its **column number**.

```
A -> 1
B -> 2
...
Z -> 26
AA -> 27
AB -> 28
```

Example:

```
Input:  "A"      Output: 1
Input:  "AB"     Output: 28
Input:  "ZY"     Output: 701
```

## Solution

Treat the title as a **base-26 number**, where `A = 1` ... `Z = 26`.

Read letters left to right, the same way you parse a decimal string:

```
result = result * 26 + value(letter)
```

Multiplying by 26 shifts everything read so far one place left; adding the letter's value (`letter - 'A' + 1`) fills the new place.

Walk through `"ZY"`:
- `Z` -> `0 * 26 + 26 = 26`
- `Y` -> `26 * 26 + 25 = 701`

Unlike ordinary base 26, there is **no zero digit** (`A` is 1, not 0). That is why the letter value is `+ 1`, and why `Z` is followed by `AA` rather than `BA`.

**Time:** O(n) — one pass over the title.
**Space:** O(1).

## Implementations

| Language | File |
|---|---|
| Python | [`python/title_to_number.py`](python/title_to_number.py) |
| Java | [`java/TitleToNumber.java`](java/TitleToNumber.java) |
| Kotlin | [`kotlin/TitleToNumber.kt`](kotlin/TitleToNumber.kt) |
| JavaScript | [`javascript/titleToNumber.js`](javascript/titleToNumber.js) |
| C# | [`csharp/TitleToNumber.cs`](csharp/TitleToNumber.cs) |
