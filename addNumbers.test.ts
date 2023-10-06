import { addNumbers } from './addNumbers'; // Import the function to be tested

// Test suite
describe('addNumbers', () => {
  // Test case 1
  it('should add two positive numbers correctly', () => {
    const result = addNumbers(5, 7);
    expect(result).toBe(12);
  });

  // Test case 2
  it('should add a positive number and a negative number correctly', () => {
    const result = addNumbers(5, -3);
    expect(result).toBe(2);
  });

  // Test case 3
  it('should add two negative numbers correctly', () => {
    const result = addNumbers(-2, -3);
    expect(result).toBe(-5);
  });
});
