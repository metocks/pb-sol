#!/usr/bin/env python

a, b = map(int, raw_input().split())
print """%d+%d=%d
%d-%d=%d
%d*%d=%d
%d/%d=%d
%d%%%d=%d""" % (
    a,b,a+b,
    a,b,a-b,
    a,b,a*b,
    a,b,a/b,
    a,b,a%b
)