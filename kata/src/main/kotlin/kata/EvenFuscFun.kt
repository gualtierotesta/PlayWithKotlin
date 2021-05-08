package kata

import java.util.stream.Stream

private tailrec fun fusc(n: Int): Int {
    return if (n == 1) 1
    else if (n % 2 == 0) fusc(n / 2) else fusc(n / 2) + fusc(1 + n / 2)
}

fun closestEvenFusc(n: Int): Int {
    return Stream.iterate(n) { i -> i!! + 1 }
            .filter { m -> fusc(m!!) % 2 == 0 }
            .findFirst()
            .orElse(Integer.MAX_VALUE)
}