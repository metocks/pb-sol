#!/usr/bin/env python


def _8_sec():
    total_sec = int(raw_input())

    d = total_sec / 24 / 60 / 60

    total_sec -= d * 24 * 60 * 60
    h = total_sec / 60 / 60

    total_sec -= h * 60 * 60
    m = total_sec / 60

    total_sec -= m * 60
    s = total_sec % 60

    print '%d %d %d %d' % (d, h, m, s)


def _9_three():
    val1 = int(raw_input())
    val2 = int(raw_input())

    mul = val2 % 10
    r1 = val1 * mul

    mul = val2 / 10 % 10
    r2 = val1 * mul

    mul = val2 / 100
    r3 = val1 * mul

    print r1
    print r2
    print r3
    print r1 + 10 * r2 + 100 * r3


def _10_koi_watch():
    h, m, s = map(int, raw_input().split())
    req_s = int(raw_input())

    hh = req_s / 60 / 60

    req_s -= 3600 * hh
    mm = req_s / 60

    ss = req_s % 60

    s += ss
    up = 0
    if s >= 60:
        up = 1
        s %= 60

    m += mm + up
    up = 0
    if m >= 60:
        up = 1
        m %= 60

    h += hh + up
    up = 0
    if h >= 24:
        up = 1
        h %= 24

    print h, m, s


def _11_business():
    org, sell, fake, rest = map(int, raw_input().split())

    paid = sell + rest
    loss = paid - org - fake - rest
    print -loss


def _12_fuse():
    c, p, r = map(int, raw_input().split())

    a = c * (1.5 + 1.0) + p * 2.0 + r * .5

    f = int(a * 2 + 9) / 10 * 10

    print '%d amperes' % f


def _13_paintblock():
    x, y, z = map(int, raw_input().split())
    


if __name__ == '__main__':
    _13_paintblock()
