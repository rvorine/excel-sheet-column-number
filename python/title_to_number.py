def title_to_number(column_title):
    result = 0

    for ch in column_title:
        # shift previous letters one place left (base 26), add this letter's value A=1..Z=26
        result = result * 26 + (ord(ch) - ord("A") + 1)

    return result


if __name__ == "__main__":
    print(title_to_number("A"))    # 1
    print(title_to_number("AB"))   # 28
    print(title_to_number("ZY"))   # 701
