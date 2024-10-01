package trycatch.githubapi;

public class User {
    private String login;
    private int id;
    private String name;
    private String bio;
    private int public_repos;

    public User(String login, int id, String name, String bio, int public_repos) {
        this.login = login;
        if (this.login.equals("null")) throw new ErroConsultaGithubException("Não foi encontrado um usuário com o username informado!\n Favor, revise o dado que foi inserido e tente novamente");
        this.id = id;
        this.name = name;
        this.bio = bio;
        this.public_repos = public_repos;
    }

    public User(UserRecord userRecord) {
        this.login = String.valueOf(userRecord.login());
        if (this.login.equals("null")) throw new ErroConsultaGithubException("Não foi encontrado um usuário com o username informado!\nFavor, revise o dado que foi inserido e tente novamente");
        this.id = Integer.valueOf(userRecord.id());
        this.name = String.valueOf(userRecord.name());
        this.bio = String.valueOf(userRecord.bio());
        this.public_repos = Integer.valueOf(userRecord.public_repos());
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    @Override
    public String toString() {
        return
                "login='" + login + '\'' +
                        ", id=" + id +
                        ", name='" + name + '\'' +
                        ", bio='" + bio + '\'' +
                        ", public_repos='" + public_repos;
    }
}
