package retrofit.json.example.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/* JSON format example:
{
   "total_count":8696,
   "incomplete_results":false,
   "items":[
      {
         "id":892275,
         "name":"retrofit",
         "full_name":"square/retrofit",
         "owner":{
            "login":"square",
            "id":82592,
            "avatar_url":"https://avatars0.githubusercontent.com/u/82592?v=4",
            "gravatar_id":"",
            "url":"https://api.github.com/users/square",
            "html_url":"https://github.com/square",
            "followers_url":"https://api.github.com/users/square/followers",
            "following_url":"https://api.github.com/users/square/following{/other_user}",
            "gists_url":"https://api.github.com/users/square/gists{/gist_id}",
            "starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}",
            "subscriptions_url":"https://api.github.com/users/square/subscriptions",
            "organizations_url":"https://api.github.com/users/square/orgs",
            "repos_url":"https://api.github.com/users/square/repos",
            "events_url":"https://api.github.com/users/square/events{/privacy}",
            "received_events_url":"https://api.github.com/users/square/received_events",
            "type":"Organization",
            "site_admin":false
         },
         "private":false,
         "html_url":"https://github.com/square/retrofit",
         "description":"Type-safe HTTP client for Android and Java by Square, Inc.",
         "fork":false,
         "url":"https://api.github.com/repos/square/retrofit",
         "forks_url":"https://api.github.com/repos/square/retrofit/forks",
         "keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}",
         "collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}",
         "teams_url":"https://api.github.com/repos/square/retrofit/teams",
         "hooks_url":"https://api.github.com/repos/square/retrofit/hooks",
         "issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}",
         "events_url":"https://api.github.com/repos/square/retrofit/events",
         "assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}",
         "branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}",
         "tags_url":"https://api.github.com/repos/square/retrofit/tags",
         "blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}",
         "git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}",
         "git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}",
         "trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}",
         "statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}",
         "languages_url":"https://api.github.com/repos/square/retrofit/languages",
         "stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers",
         "contributors_url":"https://api.github.com/repos/square/retrofit/contributors",
         "subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers",
         "subscription_url":"https://api.github.com/repos/square/retrofit/subscription",
         "commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}",
         "git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}",
         "comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}",
         "issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}",
         "contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}",
         "compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}",
         "merges_url":"https://api.github.com/repos/square/retrofit/merges",
         "archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}",
         "downloads_url":"https://api.github.com/repos/square/retrofit/downloads",
         "issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}",
         "pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}",
         "milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}",
         "notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}",
         "labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}",
         "releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}",
         "deployments_url":"https://api.github.com/repos/square/retrofit/deployments",
         "created_at":"2010-09-06T21:39:43Z",
         "updated_at":"2017-12-19T14:36:51Z",
         "pushed_at":"2017-12-18T13:40:17Z",
         "git_url":"git://github.com/square/retrofit.git",
         "ssh_url":"git@github.com:square/retrofit.git",
         "clone_url":"https://github.com/square/retrofit.git",
         "svn_url":"https://github.com/square/retrofit",
         "homepage":"http://square.github.io/retrofit/",
         "size":4556,
         "stargazers_count":25476,
         "watchers_count":25476,
         "language":"Java",
         "has_issues":true,
         "has_projects":false,
         "has_downloads":true,
         "has_wiki":true,
         "has_pages":true,
         "forks_count":5077,
         "mirror_url":null,
         "archived":false,
         "open_issues_count":65,
         "license":{
            "key":"apache-2.0",
            "name":"Apache License 2.0",
            "spdx_id":"Apache-2.0",
            "url":"https://api.github.com/licenses/apache-2.0"
         },
         "forks":5077,
         "open_issues":65,
         "watchers":25476,
         "default_branch":"master",
         "score":145.2598
      }
   ]
}
*/

public class GitHubResponse {

        @SerializedName("total_count")
        @Expose
        private Integer totalCount;
        @SerializedName("incomplete_results")
        @Expose
        private Boolean incompleteResults;
        @SerializedName("items")
        @Expose
        private List<GitHubResponseItem> items = null;

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public Boolean getIncompleteResults() {
            return incompleteResults;
        }

        public void setIncompleteResults(Boolean incompleteResults) {
            this.incompleteResults = incompleteResults;
        }

        public List<GitHubResponseItem> getItems() {
            return items;
        }

        public void setItems(List<GitHubResponseItem> items) {
            this.items = items;
        }

}
