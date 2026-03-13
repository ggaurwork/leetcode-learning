#include <iostream>
#include <cstdio>

using namespace std;

void printReverse(const char *str) {
    if (str == nullptr || !*str)
        return;

    printReverse(str + 1);
    putchar(*str);
}

void runTest(const char *input) {
    cout << "Input: ";
    
    if (input == nullptr)
        cout << "null";
    else
        cout << input;

    cout << " -> Output: ";

    printReverse(input);

    cout << endl;
}

int main() {

    runTest("hello");
    runTest("A");
    runTest("");
    runTest("madam");
    runTest("hello world");
    runTest(nullptr);

    return 0;
}