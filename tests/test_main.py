import sys
import os
from fastapi.testclient import TestClient

# Add the parent directory to sys.path
sys.path.append(os.path.dirname(os.path.dirname(os.path.abspath(__file__))))

from main import app

client = TestClient(app)

def test_read_root():
    response = client.get("/")
    assert response.status_code == 
    200
    assert response.json() == {"message": "Hello, world!"}

def test_read_item():
    response = client.get("/square/4")
    assert response.status_code == 200
    assert response.json() == {"square": 16}

    response = client.get("/square/5")
    assert response.status_code == 200
    assert response.json() == {"square": 25}
