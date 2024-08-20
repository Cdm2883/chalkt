package vip.cdms.chalkt.example

import vip.cdms.chalkt.NoColor

fun main() {
    NoColor = System.getenv("NO_COLOR")?.isNotEmpty() ?: false
}
