package com.autotest.douban;

import com.autotest.douban.domain.MovieResponseVO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @Date: 2018/7/13 17:44
 * @Description: 豆瓣查询电影分类接口
 */
public interface ISearch {
    @GET("j/search_tags")
    Call<MovieResponseVO> searchTags(@Query("type") String type, @Query("source") String source);
}
