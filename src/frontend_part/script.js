const button = document.querySelector('#button-register'),
    name = document.querySelector('.registerName'),
    password = document.querySelector('.registerPassword')



button.addEventListener('click', () => {
    alert('Приветствую, ' + name.value)
});