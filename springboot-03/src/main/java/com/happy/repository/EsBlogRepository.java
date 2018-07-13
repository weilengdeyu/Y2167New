package com.happy.repository;

import com.happy.entity.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by Happy on 2018-07-01.
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {
    //分页查询博客  findBy
    Page<EsBlog> findByTitleOrSummaryOrContent(String title, String summary, String content, Pageable pageable);
}
