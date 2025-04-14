# Sử dụng node:18-alpine làm base image
FROM node:18-alpine

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy file package.json và package-lock.json trước để tối ưu build cache
COPY package.json package-lock.json ./

# Cài đặt dependencies
RUN npm install

# Copy toàn bộ mã nguồn vào container
COPY . .

# Build ứng dụng
RUN npm run build

# Cấu hình Nginx để phục vụ ứng dụng React
FROM nginx:alpine
COPY --from=0 /app/build /usr/share/nginx/html

# Expose cổng 80
EXPOSE 80

# Khởi động Nginx
CMD ["nginx", "-g", "daemon off;"]
