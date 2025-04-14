# Sử dụng image Nginx mới nhất
FROM nginx:latest

# Copy file index.html vào thư mục phục vụ web của Nginx
COPY index.html /usr/share/nginx/html/index.html

# Expose cổng 80
EXPOSE 80

# Chạy Nginx
CMD ["nginx", "-g", "daemon off;"]
