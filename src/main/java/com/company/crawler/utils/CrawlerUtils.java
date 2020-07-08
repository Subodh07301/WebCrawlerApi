package com.company.crawler.utils;

import java.net.URL;

/**
 * General Utilities classes
 *
 * @Author: Subodh Kumar
 */
public final class CrawlerUtils {

    public final static boolean isValidURL(URL url) {
        return url != null
                && ( url.getProtocol().startsWith("http") || url.getProtocol().startsWith("https") )
                && !url.getProtocol().endsWith("#");
    }
}
