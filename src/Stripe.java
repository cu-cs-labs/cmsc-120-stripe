// the width stripe draws for unit u
int stripeWidth(int u) {
    return u * 6;
}

void main() {

    // checks for stripeWidth
    Check.is(stripeWidth(10), 60);
    Check.is(stripeWidth(5), 30);

    // print final report at the very end:
    Check.done();
}
