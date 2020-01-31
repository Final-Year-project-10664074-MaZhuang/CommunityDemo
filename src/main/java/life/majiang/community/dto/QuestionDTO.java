package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
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
    private User user;
}
