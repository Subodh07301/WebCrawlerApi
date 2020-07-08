package com.company.crawler.model;

import com.company.crawler.exceptions.CrawlerException;

import java.io.IOException;
import java.net.URL;

/**
 *
 * Crawler Interface
 * @Author: Subodh Kumar
 */
public interface ICrawler {

    Crawler crawlURL(URL rootUrl, int maxDepth) throws IOException, CrawlerException;

}
