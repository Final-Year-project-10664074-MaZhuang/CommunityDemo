package life.majiang.community.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private Integer commentcount;
    private Integer viewcount;
    private Integer likecount;
    private Integer creator;
    private String title;
    private String description;
    private String tag;
    private Long gmtcreate;
    private Long gmtmodified;
}
