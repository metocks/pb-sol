#!/usr/bin/env python

price = int(raw_input())

rest = 1000 - price
c100 = int(rest / 100)

rest = rest - c100 * 100
c50 = int(rest / 50)

rest = rest - c50 * 50
c10 = int(rest / 10)

print c100, c50, c10
