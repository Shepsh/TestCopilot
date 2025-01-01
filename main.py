from fastapi import FastAPI

app = FastAPI()

@app.get("/")
def read_root():
    return {"message": "Hello, world!"}

@app.get("/square/{number}")
def read_item(number: int):
    return {"square": number ** 2}
 