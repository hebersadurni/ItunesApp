package com.example.itunesapp.ModelMvp.Model;

import java.util.List;

import com.example.itunesapp.ModelMvp.Result;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassicSongs {

    @SerializedName("resultCount")
    @Expose
    private Integer resultCount;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}