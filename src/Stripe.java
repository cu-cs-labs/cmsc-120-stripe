// the width stripe draws for unit u
int stripeWidth(int u) {
    return u * 6;
}

void main() {
    Check.is(stripeWidth(10), 60);
    Check.is(stripeWidth(5), 30);
    Check.done();
}
