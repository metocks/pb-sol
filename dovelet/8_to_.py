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

    print 4 * max(0, z - 2) + 2 * (2 * max(0, x - 2) + 2 * max(0, y - 2))


def _14_r2():
    r1, m = map(int, raw_input().split())

    # m = (r1 + r2) / 2
    # 2m - r1 = r2

    r2 = 2 * m - r1
    print r2


def _15_coci_faktor():
    """<http://59.23.113.171/30stair/coci_faktor/coci_faktor.php?pname=coci_faktor>"""

    # faktor = up(refers / papers)
    # z = y / x, then x = y / z
    # refers = faktor * papers ?

    papers, faktor = map(int, raw_input().split())

    print papers * (faktor - 1) + 1


def _16_coci_slatkisi():
    price, unit = map(int, raw_input().split())

    # xq ~= round(price)
    q = 10 ** unit

    print (price + q / 2) / q * q


def _17_butter():
    # time = n for each 1mouse & 1butter
    # m mouse & m butter require n time!
    n, m = map(int, raw_input().split())
    print n


def _18_slant():
    x1, y1 = map(int, raw_input().split())
    x2, y2 = map(int, raw_input().split())

    d = (y2 - y1) / (x2 - x1)
    diff = y1 - x1 * d
    print d, diff


def _19_maxandmin():
    x, y = map(int, raw_input().split())
    print max(min(x, y), x)


def _20_angle():
    n = int(raw_input())

    sum_inside_angle = (n - 2) * 180  # sum of onside angle = triangle * (n-2).  ex) rect = 2 * triangle
    sum_outside_angle = 360  # Always! sum of outside angle is 360!

    print sum_inside_angle, sum_outside_angle


def _21_spot():
    d = float(raw_input())
    p = float(raw_input())

    percent = (100 + p) / 100
    print "%.03f" % (d - d * percent)


if __name__ == '__main__':
    _21_spot()
