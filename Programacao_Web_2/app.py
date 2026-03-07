from flask import Flask

app = Flask(__name__)

@app.route('/')
def home():
    return(
        "<h1>Bem-vindo ao meu site!</h1>"
    )

@app.route('/contato')
def contato():
    return(
        "<h1>Entre em contato com seunome@gmail.com</h1>"
    )