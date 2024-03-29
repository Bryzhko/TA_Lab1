@Comment
Feature: Add Comment on a Blog/Post
  As a Looegd in User of the application
  I want to write a comment to a Blog/Post successfully

  Background: User sees a blog on Homepage and clicks on it
    Given I am a logged in user
    And I see a blog listing on the Homepae

  @SuccessfulAddComment
  Scenario Outline: Successful Add Comment to a Blog/Post
    When I click on Blog listing link on the Home page
    Then I should land on the "posts" page
    When I fill in message with "<message>"
    And I click on the Add Comment button
    Then I should see the comment "<message>" added to the blog
    Examples:
      | message			|
      |	asdf			|