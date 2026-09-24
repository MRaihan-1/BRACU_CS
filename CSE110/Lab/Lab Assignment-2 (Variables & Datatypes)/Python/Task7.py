distance = 1204
hours = 5
minutes = 56
seconds = 23
total_hours = hours + (minutes / 60) + (seconds / 3600)

distance_km = distance / 1000
distance_miles = distance / 1609

velocity_kmh = distance_km / total_hours
velocity_mph = distance_miles / total_hours

print("Your velocity in km/h is ", velocity_kmh)
print(f"Your velocity in km/h is {velocity_kmh:.7f}")
print(f"Your velocity in miles/h is {velocity_mph:.7f}")
