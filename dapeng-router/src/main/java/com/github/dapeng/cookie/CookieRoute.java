package com.github.dapeng.cookie;

import com.github.dapeng.router.condition.Condition;

import java.util.List;

/**
 * @author <a href=mailto:leihuazhe@gmail.com>maple</a>
 * @since 2018-10-24 3:52 PM
 */
public class CookieRoute {
    private final Condition left;

    private final List<CookieRight> cookieRightList;

    public CookieRoute(Condition left, List<CookieRight> cookieRightList) {
        this.left = left;
        this.cookieRightList = cookieRightList;
    }

    public Condition getLeft() {
        return left;
    }

    public List<CookieRight> getCookieRightList() {
        return cookieRightList;
    }

    @Override
    public String toString() {
        return "CookieRoute{ left=" + left + ", cookieInfoList=" + cookieRightList + '}';
    }
}