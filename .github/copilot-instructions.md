# Quy tắc phát triển dự án (MCP Rules)

## 1. Ưu tiên tiếng Việt
- Sử dụng tiếng Việt rõ ràng, dễ hiểu trong tài liệu, comment, commit message, và giao tiếp nội bộ.

## 2. Clean Code
- Đặt tên biến, hàm, class rõ nghĩa, nhất quán.
- Tránh lặp code, tách hàm hợp lý, tuân thủ SOLID.
- Xóa code thừa, comment cũ, log debug không cần thiết.
- Không để code gây ảo giác hoặc khó hiểu.

## 3. Tối ưu code Java
- Sử dụng collection phù hợp (ArrayList, HashMap, ...).
- Hạn chế synchronized, tránh memory leak.
- Sử dụng Stream API hợp lý, không lạm dụng.
- Xử lý exception rõ ràng, không catch Exception chung chung.

## 4. Tối ưu Database
- Viết query rõ ràng, tránh N+1 query, index hợp lý.
- Sử dụng transaction đúng chỗ, rollback khi cần.
- Không hardcode connection string, dùng config.
- Kiểm tra performance query định kỳ.

## 5. Quy trình review
- Bắt buộc code review trước khi merge.
- Reviewer cần hỏi lại nếu không rõ ý, tránh phán đoán chủ quan.
- Không approve nếu chưa hiểu rõ logic hoặc thấy có dấu hiệu code smell.

## 6. Quy tắc giao tiếp
- Nếu không rõ yêu cầu, phải hỏi lại, không tự suy diễn.
- Ưu tiên trả lời đúng trọng tâm, tránh lan man.

## 7. Đảm bảo bảo mật
- Không log thông tin nhạy cảm (password, token).
- Kiểm tra input đầu vào, tránh SQL Injection, XSS.

## 8. Viết test
- Bắt buộc viết unit test cho business logic quan trọng.
- Ưu tiên viết integration test cho các chức năng liên quan database.

## 9. Tài liệu hóa
- Cập nhật tài liệu khi có thay đổi lớn.
- Viết README, hướng dẫn setup, deploy rõ ràng.

---
**Lưu ý:**
- Luôn tham khảo file này trước khi phát triển/chỉnh sửa code.
- Có thể bổ sung thêm rule nếu cần thiết để phù hợp thực tế dự án.
