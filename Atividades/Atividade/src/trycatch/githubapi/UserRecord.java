package trycatch.githubapi;

public record UserRecord(String login,
                         int id,
                         String name,
                         String bio,
                         String public_repos) {
}
