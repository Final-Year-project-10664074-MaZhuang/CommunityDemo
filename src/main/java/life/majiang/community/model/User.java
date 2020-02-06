package life.majiang.community.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.ID
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.ACCOUNT_ID
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.NAME
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.TOKEN
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.GMT_CREATE
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.GMT_MODIFY
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    private Long gmtModify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.BIO
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    private String bio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.AVATAR_URL
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    private String avatarUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.ID
     *
     * @return the value of USER.ID
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.ID
     *
     * @param id the value for USER.ID
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.ACCOUNT_ID
     *
     * @return the value of USER.ACCOUNT_ID
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.ACCOUNT_ID
     *
     * @param accountId the value for USER.ACCOUNT_ID
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.NAME
     *
     * @return the value of USER.NAME
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.NAME
     *
     * @param name the value for USER.NAME
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.TOKEN
     *
     * @return the value of USER.TOKEN
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.TOKEN
     *
     * @param token the value for USER.TOKEN
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.GMT_CREATE
     *
     * @return the value of USER.GMT_CREATE
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.GMT_CREATE
     *
     * @param gmtCreate the value for USER.GMT_CREATE
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.GMT_MODIFY
     *
     * @return the value of USER.GMT_MODIFY
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public Long getGmtModify() {
        return gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.GMT_MODIFY
     *
     * @param gmtModify the value for USER.GMT_MODIFY
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public void setGmtModify(Long gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.BIO
     *
     * @return the value of USER.BIO
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public String getBio() {
        return bio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.BIO
     *
     * @param bio the value for USER.BIO
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public void setBio(String bio) {
        this.bio = bio == null ? null : bio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.AVATAR_URL
     *
     * @return the value of USER.AVATAR_URL
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.AVATAR_URL
     *
     * @param avatarUrl the value for USER.AVATAR_URL
     *
     * @mbg.generated Thu Feb 06 19:08:34 GMT 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }
}