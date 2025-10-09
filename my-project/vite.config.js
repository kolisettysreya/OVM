import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import tailwindcss from '@tailwindcss/vite'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react(),
  tailwindcss()],
  base: '/frontapp/',
  server: {
    port: 8080, 
    proxy: {
      '/backend': 'http://localhost:7075'
    }
  }
})
