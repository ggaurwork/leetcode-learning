def print_reverse(s, index=0):
    if s is None or index >= len(s):
        return
    
    print_reverse(s, index + 1)
    print(s[index], end='')


def run_test(input_str):
    print("Input:", "null" if input_str is None else input_str, "-> Output:", end=" ")
    
    if input_str is None:
        print_reverse(None)
    else:
        print_reverse(input_str)
    
    print()


if __name__ == "__main__":
    run_test("hello")
    run_test("A")
    run_test("")
    run_test("madam")
    run_test("hello world")
    run_test(None)