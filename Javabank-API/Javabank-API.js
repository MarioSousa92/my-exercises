document.addEventListener("DOMContentLoaded", function () {

url = "http://localhost:8080/javabank5/api/customer";


function getData(url) {
    fetch(url)
        .then((response) => response.json())
        .then((data) => console.log(data))
        .catch((error) => console.error(error));
}

getData(url);

});





async function fetchGitHubUser(login) {
    const api = `https://api.github.com/users/${login}`;
    const response = await fetch(api);
    const body = await response.json();
  
    if (!response.ok) {
      // throwing inside async rejects the returned promise
      throw new Error(body.message);
    }
  
    return body;
  }

  async function showGitHubUser(login) {
    try {
      const user = await fetchGitHubUser(login);
      console.log(`${user.name} is from ${user.location}`);
    } catch (err) {
      console.log(err.message);
    }
  }