import sys
import os

# Adiciona o caminho da pasta "Arquivos" à lista de caminhos de importação
sys.path.append('/Users/luanmorais/Desktop/Arquivos')

from db_config import DB_CONFIG
import psycopg2

# Usa o dicionário de configuração
conn = psycopg2.connect(**DB_CONFIG)
cur = conn.cursor()

cur.execute("SELECT version();")
print("Versão do PostgreSQL:", cur.fetchone())

cur.close()
conn.close()